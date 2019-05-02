using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace assign2
{
    class Program
    {
        static void Main(string[] args)
        {
            Product pr = new Product();
            pr.GetInfo();
            pr.Checkqty();
            pr.AddImageTogallery();
            pr.DeleteImageFromGallery();
            Console.ReadKey();
        }        

        }
    }

