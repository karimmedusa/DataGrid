package ir.home.datagrid;

public class Student {

    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }


    public String getUserName() {
        return userName;
    }


    public void setUserName(String userName) {
        this.userName = userName;
    }


    public String getComment() {
        return comment;
    }


    public void setComment(String comment) {
        this.comment = comment;
    }

    private String id;
    private String userName;
    private String comment;

}
