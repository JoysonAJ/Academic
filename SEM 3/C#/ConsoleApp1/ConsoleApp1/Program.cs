namespace wordLength
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter the string");
            string str = Console.ReadLine();
            string[] chArr = str.Split(" ");
            for (int i = 0; i < chArr.Length; i++)
            {
                for (int j = 0; j < chArr.Length - i - 1; j++)
                {
                    if (chArr[j].Length > chArr[j + 1].Length)
                    {
                        string temp = chArr[j];
                        chArr[j] = chArr[j + 1];
                        chArr[j + 1] = temp;
                    }
                }
            }
            foreach (string ch in chArr)
            {
                Console.WriteLine(ch +"\t - \t"+ ch.Length);
            }
        }
    }
}
