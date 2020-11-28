package com.company;
import java.io.FileWriter;
import java.util.Scanner;
public class File
{
    public static void main(String[] args)
    {
        try(FileWriter writer = new FileWriter("file.txt", false))
        {
            Scanner scan = new Scanner(System.in);
            String t = scan.nextLine();
            writer.append(t);
            writer.flush();

        }
        catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }
}
