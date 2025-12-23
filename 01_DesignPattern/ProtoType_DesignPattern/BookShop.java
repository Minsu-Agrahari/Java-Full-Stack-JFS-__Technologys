package DesignPattern.ProtoType_DesignPattern;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {
    private String shopName;
    private List<Book> book = new ArrayList<>();
    
    public String getShopName() {
        return shopName;
    }
    public void setShopName(String shopName) {
        this.shopName = shopName;
    }
    public List<Book> getBook() {
        return book;
    }
    public void setBook(List<Book> book) {
        this.book = book;
    }

    // fetching the data --> dataBase
    public void localData(){
        for(int i=1; i<=10; i++){
            Book b = new Book();
            b.setBid(i);
            b.setBname("Book"+i);
            getBook().add(b);
        }
    }

    @Override
    public String toString() {
        return "BookShop [shopName=" + shopName + ", book=" + book + "]";
    }
    
    // ----->> Shadow Copy
    // @Override
    // protected Object clone() throws CloneNotSupportedException {
    //     // TODO Auto-generated method stub
    //     return super.clone();
    // }

    // desc :- Deep Copy --[Copy the data from the old object Rather than the DataBase]
    @Override
    protected BookShop clone() throws CloneNotSupportedException {
        BookShop shop = new BookShop();

        for(Book b : this.getBook()){
            shop.getBook().add(b);
        }

        return shop;

    }
    
}
