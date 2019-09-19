/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diliru
 */
class Overdue {
    
     private String book_id,member_id,lend_date,due_date;
    
    public Overdue(String book_id,String member_id,String lend_date,String due_date){
    
        this.book_id=book_id;
        this.member_id=member_id;
        this.lend_date=lend_date;
        this.due_date=due_date;
        
    }
    
    public String get_book_id(){
        
        return book_id;

    }
    
    public String get_member_id(){
        
        return member_id;

    }
    
    public String get_lend_date(){
        
        return lend_date;

    }
    
    public String get_due_date(){
        
        return due_date;

    }
    
}
