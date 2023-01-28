namespace ItemClass
{
    public class Item
    {
        int ino, rate, qty, amount;
        string itemName;
        public void setData()
        {
            Console.WriteLine("Enter the item name  and Item number ");
            itemName = Console.ReadLine();
            //Console.WriteLine("Enter the item no");
            ino = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Enter the rate and Quantity");
            rate = Convert.ToInt32(Console.ReadLine());
            //Console.WriteLine("Enter the Quantity");
            qty = Convert.ToInt32(Console.ReadLine());
            amount = rate * qty;
        }
        public void getData()
        {
            Console.WriteLine("Item no = " + ino);
            Console.WriteLine("Item name = " + itemName);
            Console.WriteLine("Item rate = " + rate);
            Console.WriteLine("Item quantity = " + qty);
            Console.WriteLine("Amount = " + amount);
        }
        public bool checkGreat(Item item)
        {
            return amount < item.amount;
        }
    }
    internal class Program
    {
        static void Main(string[] args)
        {
            Item[] item = new Item[5];
            for (int i = 0; i < 5; i++)
            {
                item[i] = new Item();
                item[i].setData();
            }
            for (int i = 0; i < 5; i++)
            {
                for (int j = 0; j < 5 - i - 1; j++)
                {
                    if (item[j].checkGreat(item[j + 1]))
                    {
                        Item item1 = item[j];
                        item[j] = item[j + 1];
                        item[j + 1] = item1;
                    }
                }
            }
            Console.WriteLine("________________________________________________________");

            for (int i = 0; i < 5; i++)
            {
                item[i].getData();
            }
        }
    }
}

