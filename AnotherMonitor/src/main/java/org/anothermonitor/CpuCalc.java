package org.anothermonitor;

public class CpuCalc {
    private Long work;

    private Long total;

    public CpuCalc(Long work, Long total) {
        this.work = work;
        this.total = total;
    }

    public Long getWork() {
        return work;
    }

    public void setWork(Long work) {
        this.work = work;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

}
