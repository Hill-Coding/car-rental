package io;

import java.util.Scanner;

public class DataReader {

    Scanner scanner = new Scanner(System.in);

    public int readInt() {
        try {
            return scanner.nextInt();
        } finally {
            scanner.nextLine();
        }
    }

    public String readString() {
        return scanner.nextLine();
    }

    public void close() {
        scanner.close();
    }
}
