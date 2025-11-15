package com.week2.assignment;

public class Downloader {
    public static void main(String[] args) throws Exception {
        Thread t1 = new DownloadThread("Part 1");
        Thread t2 = new DownloadThread("Part 2");
        Thread t3 = new DownloadThread("Part 3");

        t1.start(); t2.start(); t3.start();

        t1.join(); t2.join(); t3.join();

        System.out.println("Download complete!");
    }
}
