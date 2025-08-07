package kr.ac.kopo.ctc.kopo36.board.dto;

public class PaginationInfo {
    private int firstPage;
    private int prevPage;
    private int startPage;
    private int currentPage;
    private int endPage;
    private int nextPage;
    private int lastPage;
    private int totalPageCont;

    public int getCurrentPage() {
        return currentPage;
    }

    public int getEndPage() {
        return endPage;
    }

    public int getFirstPage() {
        return firstPage;
    }

    public int getLastPage() {
        return lastPage;
    }

    public int getNextPage() {
        return nextPage;
    }

    public int getPrevPage() {
        return prevPage;
    }

    public int getStartPage() {
        return startPage;
    }

    public int getTotalPageCont() {
        return totalPageCont;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public void setEndPage(int endPage) {
        this.endPage = endPage;
    }

    public void setFirstPage(int firstPage) {
        this.firstPage = firstPage;
    }

    public void setLastPage(int lastPage) {
        this.lastPage = lastPage;
    }

    public void setNextPage(int nextPage) {
        this.nextPage = nextPage;
    }

    public void setPrevPage(int prevPage) {
        this.prevPage = prevPage;
    }

    public void setStartPage(int startPage) {
        this.startPage = startPage;
    }

    public void setTotalPageCont(int totalPageCont) {
        this.totalPageCont = totalPageCont;
    }
}
