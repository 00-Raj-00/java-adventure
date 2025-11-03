public class demoelse{
                    public static void main(String[] args) {

                        int x =8;
                        int y = 7;
                        int z = 9;
                        if(x>y && x>z)
                        {
                            System.out.println(x);
                            System.out.println("thank you");
                        }
                        else if(y>z)
                            System.out.println(y);
                        else
                            System.out.println(z);
                        int result;
                        result = (x>y) && (x>z)? 8:(y>z)? 7: 9;
                                System.out.println(result);