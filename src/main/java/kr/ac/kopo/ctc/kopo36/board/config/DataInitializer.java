package kr.ac.kopo.ctc.kopo36.board.config;

import kr.ac.kopo.ctc.kopo36.board.domain.User;
import kr.ac.kopo.ctc.kopo36.board.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class DataInitializer {

    @Bean
    public CommandLineRunner initUser(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        return args -> {
            if (userRepository.findByUsername("admin").isEmpty()) {
                User adminUser = new User();
                adminUser.setUsername("admin");
                adminUser.setPassword(passwordEncoder.encode("admin"));
                adminUser.setRoles("ADMIN, USER");
                userRepository.save(adminUser);
                System.out.println("Admin user created: admin");
            }

            if (userRepository.findByUsername("user").isEmpty()) {
                User regularUser = new User();
                regularUser.setUsername("user");
                regularUser.setPassword(passwordEncoder.encode("user"));
                regularUser.setRoles("USER");
                userRepository.save(regularUser);
                System.out.println("Admin user created: user");
            }
        };
    }
}
