/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diliru
 */
class Reserved {
    
    private String book_id,member_id;
    
    public Reserved(String book_id,String member_id){
    
        this.book_id=book_id;
        this.member_id=member_id;
        
    }
    
    public String get_book_id(){
        
        return book_id;

    }
    
    public String get_member_id(){
        
        return member_id;

    }
}
