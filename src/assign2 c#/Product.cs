using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace assign2
{
    class Product
    {
        public String Name;
        public int ID;
        public int price;
        public int quatity;
        public String Image;
        public String Desc;

        internal void AddImageTogallery()
        {
            throw new NotImplementedException();
        }

        internal void DeleteImageFromGallery()
        {
            throw new NotImplementedException();
        }

        List<string> gallery;


        public Product(string name, int iD, int price, int quatity, string image, string desc, List<string> gallery)
        {
            Name = name;
            ID = iD;
            this.price = price;
            this.quatity = quatity;
            Image = image;
            Desc = desc;
            this.gallery = gallery;
        }

        public Product()
        {
        }



        public void GetInfo()
        {
            Console.WriteLine("Name:" + Name);

            Console.WriteLine("ID:" + ID);

            Console.WriteLine("Price:" + price);

            Console.WriteLine("quatity:" + quatity);
            Console.WriteLine("Image:" + Image);

            Console.WriteLine("desc:" + Desc);
            foreach (String img in gallery)
            {
                Console.WriteLine("Gallery:" + img);
            }

        }
        public bool Checkqty()
        {
            if (this.quatity > 0) { return true; }
            return false;
        }
        public void AddImageTogallery(String Image)
        {
            if (gallery.Count >= 10)
            {
                Console.WriteLine("nhiều ảnh r xóa bớt đi");
                return;
            }
            gallery.Add(Image);
            Console.WriteLine("thêm ảnh thành công");
        }


        public void DeleteImageFromGallery(String Image)
        {
            if (gallery.Count < 1)
            {
                Console.WriteLine("không có ảnh nào để xóa");
                return;
            }
            gallery.Remove(Image);

        }


    }
}
