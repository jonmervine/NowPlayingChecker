package com.darkmage530.nowplayingchecker;

import com.darkmage530.nowplayingchecker.domain.GensokyoRadioApi;
import com.google.gson.Gson;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

@SpringBootApplication
public class NowplayingcheckerApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(NowplayingcheckerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        String gensokyoRadioApi = "https://gensokyoradio.net/api/station/playing/";
        Gson gson = new Gson();

        File allCombinedOutputFile = new File("gensokyoradiooutput.txt");

        String previousSongTitle = "";
        String previousArtist = "";

        while (true) {
            URL url = new URL(gensokyoRadioApi);
            URLConnection request = url.openConnection();
            InputStreamReader inputStreamReader = new InputStreamReader((InputStream) request.getContent());
            GensokyoRadioApi radioApi = gson.fromJson(inputStreamReader, GensokyoRadioApi.class);

            try (FileWriter fw = new FileWriter(allCombinedOutputFile, true);
                 BufferedWriter bw = new BufferedWriter(fw);
                 PrintWriter out = new PrintWriter(bw)) {
                if (!radioApi.getSongInfo().getTitle().equalsIgnoreCase(previousSongTitle) ||
                        !radioApi.getSongInfo().getArtist().equalsIgnoreCase(previousArtist)) {
                    String songInfo = gson.toJson(radioApi);
                    out.println(songInfo);

                    System.out.println("Updated next song with: " + gson.toJson(radioApi.getSongInfo()));

                    previousArtist = radioApi.getSongInfo().getArtist();
                    previousSongTitle = radioApi.getSongInfo().getTitle();
                }

            } catch (IOException e) {
                throw e;
            }
            Thread.sleep(25000);
        }
    }
}
