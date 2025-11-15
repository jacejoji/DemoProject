package com.week2.assignment;

class DownloadThread extends Thread {
    private String part;

    public DownloadThread(String part) {
        this.part = part;
    }

    public void run() {
        try {
            System.out.println("Downloading: " + part);
            Thread.sleep(2000);
            System.out.println(part + " download completed.");
        } catch (InterruptedException e) {}
    }
}
