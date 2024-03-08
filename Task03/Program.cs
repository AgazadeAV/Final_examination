void PrintInvertedArray(int[] array, int size)
{
    if (size < 1)
    {
        return;
    }
    Console.Write($"{array[size - 1]} ");
    PrintInvertedArray(array, size - 1);
}

int[] array = [5, 15, 25, 35, 45];
int size = array.Length;
PrintInvertedArray(array, size);