/** OrdersCustom 订单类的拓展类 */
public class OrdersCustom extends Orders{
    //resultMap方式
   // 一对一 关联用户
    private UserCustom userCustom; public UserCustom getUserCustom() {
        return userCustom;
    }
    public void setUserCustom(UserCustom userCustom) {
        this.userCustom = userCustom;
    }
    @Override
    public String toString() {
        return super.toString()+"OrdersCustom [userCustom=" + userCustom + "]";
    }
}