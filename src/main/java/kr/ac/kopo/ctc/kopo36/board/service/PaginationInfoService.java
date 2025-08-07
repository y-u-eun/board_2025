package kr.ac.kopo.ctc.kopo36.board.service;

import kr.ac.kopo.ctc.kopo36.board.dto.PaginationInfo;
import org.springframework.stereotype.Service;

@Service
public class PaginationInfoService {

    public PaginationInfo getPaginationInfo(int currentPage, int pagePerBlock, int itemPerPage, int totalItems) {

        PaginationInfo paginationInfo = new PaginationInfo();

        // 전체 페이지 수
        int totalpagecount;
        if ((totalItems / itemPerPage) == ((float) totalItems / (float) itemPerPage)) {
            totalpagecount = (totalItems / itemPerPage);
        } else {
            totalpagecount = (totalItems / itemPerPage) + 1;
        }
//        System.out.println(totalpagecount);
        if (currentPage > totalpagecount) {
            currentPage = totalpagecount;
        } else if (currentPage < 1) {
            currentPage = 1;
        }

        // 페이지 블럭 설정
        int pcnt, startpage, endpage = 0;
        if ((currentPage / pagePerBlock) == ((float) currentPage / (float) pagePerBlock)) {
            pcnt = (currentPage / pagePerBlock);
        } else {
            pcnt = (currentPage / pagePerBlock) + 1;
        }
        startpage = ((pcnt - 1) * pagePerBlock) + 1;
        endpage = pcnt * pagePerBlock;

        if (endpage > totalpagecount) {
            endpage = totalpagecount;
        }
        if (startpage == endpage) {
            endpage = -1;
        }

//        System.out.println(startpage + " " + endpage);
        // 현재 페이지의 이전 페이지(p)
        int prevpage = -1;
        if (startpage != 1) {
            prevpage = startpage - 1;
        }

        // 현재 페이지의 이후 페이지(n)
        int nextpage = -1;
        if (endpage != -1 && endpage != totalpagecount) {
            nextpage = endpage + 1;
        }
//        System.out.println(prevpage + " " + nextpage);
        // 첫번째 페이지(pp)
        int firstpage = -1;
        if (prevpage != -1) {
            firstpage = 1;
        }

        // 마지막 페이지(nn)
        int lastpage = -1;
        if (nextpage != -1) {
            lastpage = totalpagecount;
        }

        paginationInfo.setFirstPage(firstpage);
        paginationInfo.setPrevPage(prevpage);
        paginationInfo.setStartPage(startpage);
        paginationInfo.setCurrentPage(currentPage);
        paginationInfo.setEndPage(endpage);
        paginationInfo.setNextPage(nextpage);
        paginationInfo.setLastPage(lastpage);
        paginationInfo.setTotalPageCont(totalpagecount);
        return paginationInfo;
    }
}
