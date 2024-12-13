public class User {
    private int id; // 用户ID
    private String name; // 用户名

    // 构造函数
    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // id的getter方法
    public int getId() {
        return id;
    }

    // id的setter方法
    public void setId(int id) {
        this.id = id;
    }

    // name的getter方法
    public String getName() {
        return name;
    }

    // name的setter方法
    public void setName(String name) {
        this.name = name;
    }

    // 可以添加其他方法，比如toString()方法，用于打印用户信息
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}