package com.company;

public class iDNumber
{
    static void insertionSort(Student[] array)
    {
        for (int left = 0; left < array.length; left++)
        {
            var value = array[left];
            int i = left - 1;
            for (; i >= 0; i--)
            {
                if (value.getId() < array[i].getId())
                {
                    array[i + 1] = array[i];
                }
                else
                    {
                    break;
                    }
            }
            array[i + 1] = value;
        }
    }
    public static void main(String[] args)
    {
        var students = Student.getSamples();
        for (var t : students) System.out.println(t);
        System.out.println();
        insertionSort(students);
        for (var t : students) System.out.println(t);
    }
}
