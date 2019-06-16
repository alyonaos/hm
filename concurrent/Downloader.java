package concurrent;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Downloader {
    private static final String FILE_URL = null;
    public Downloader(Object url, String path, String name) throws IOException {
        BufferedInputStream in = new BufferedInputStream(new URL(FILE_URL).openStream());
    }
}
