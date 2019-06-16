package concurrent;

import java.io.File;
import java.util.List;

public class thread {
    protected void download(List<File> files, String path, String nThreads) throws InterruptedException {

        int countTreads = 0;
        int n = Integer.parseInt(nThreads);

        while(countTreads < files.size()) {
            Thread[] threads = new Thread[Integer.parseInt(nThreads)];

            for (int j = 0; j < n && j + countTreads != files.size(); ++j) {
                threads[j] = new Thread(new MyThread(files.get(countTreads + j), path),
                        String.format("Thread %d", j));
            }

            if(countTreads + threads.length <= files.size()) {
                countTreads = countTreads + threads.length;
            }
            startThreads(threads);
        }
    }

    private static void startThreads(Thread[] threads) throws InterruptedException {
        for (Thread thread : threads) {
            if(thread == null){
                System.exit(0);
            }
            thread.start();
            //thread.join();
        }

    }
}

class MyThread implements Runnable {

    private String path;
    private File file;

    MyThread(File file, String path){
        this.path = path;
        this.file = file;
    }

    public  void run() {
        new Downloader(file.get(), path, file.getName()).startDownload();
        System.out.println(Thread.currentThread().getName());
        System.out.println(" ============================== ");
    }
}
