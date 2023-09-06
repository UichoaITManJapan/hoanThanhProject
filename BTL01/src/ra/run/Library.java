package ra.run;

import ra.color.ColorManager;
import ra.entity.Book;
import ra.entity.Category;
import ra.file.FileManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public  class Library {
    public static Scanner scanner = new Scanner(System.in);
    public static List<Category> categoryList = new ArrayList<>();
    public static List<Book> bookList = new ArrayList<>();
    public static void main(String[] args) {
        categoryList = FileManager.readDataFromCategoryFile();
        bookList = FileManager.readDataFromBookFile();
        System.out.println(ColorManager.YELLOW_BOLD+"\tCHÀO MỪNG BẠN ĐẾN VỚI TRANG QUẢN LÝ THƯ VIỆN"+ColorManager.RESET);
        libraryMenu();
    }
    // quản lý thư viện
    public static void libraryMenu(){
        do {
            System.out.println();
            System.out.println(ColorManager.PURPLE+"☥------------------------------------------------☥");
            System.out.println("⎜                 " + ColorManager.BLUE_BOLD +"QUẢN LÝ THƯ VIỆN" + ColorManager.RESET +ColorManager.PURPLE+"               ⎜");
            System.out.println("☥------------------------------------------------☥");
            System.out.println("⎜  "+ColorManager.TRANGSUA+"1."+ColorManager.RESET+ColorManager.PURPLE+"  ⎜          "+ColorManager.CYAN_BOLD+"Quản lý Thể loại"+ColorManager.RESET+ColorManager.PURPLE+"               ⎜");
            System.out.println("⎜  "+ColorManager.PINK+"2."+ColorManager.RESET+ColorManager.PURPLE+"  ⎜          "+ColorManager.CYAN_BOLD+"Quản lý Sách"+ColorManager.RESET+ColorManager.PURPLE+"                   ⎜");
            System.out.println("⎜  "+ColorManager.DONHAT+"3."+ColorManager.RESET+ColorManager.PURPLE+"  ⎜          "+ColorManager.RED_BOLD+"Thoát"+ColorManager.RESET+ColorManager.PURPLE+"                          ⎜");
            System.out.println("☥------------------------------------------------☥");
            System.out.print(ColorManager.TRANGSUA +"   Chọn chức năng :\t " + ColorManager.RESET);
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                System.out.println();
                System.out.println();
                switch (choice){
                    case 1:
                        CatalogMenu.catalogMenu();
                        break;
                    case 2:
                       BookMenu.bookMenu();
                       break;
                    case 3:
                        System.out.println(ColorManager.YELLOW+"Cảm ơn quý khách đã tin yêu sử dụng chương trình của chúng tôi. Rất mong nhận được sự phản hồi tích cực của quý khách hàng");
                        System.out.println("về chương trình lần này. Trong quá trình trải nghiêm chương trình, mọi thắc mắc hay ý kiến đóng góp xin liên hệ tới hệ thống");
                        System.out.println("qua đường dây  "+ColorManager.YELLOW_BOLD+"Hot-line ☎️: 070 2373 xxxx ."+ColorManager.RESET+ColorManager.YELLOW_BOLD);
                        System.out.println("Sự đóng góp ý kiến của quý khách sẽ là tiền đề cho sự thành công của những sản phẩm chương trình tiếp theo của chúng tôi");
                        System.out.println("Rất mong luôn nhận được sự ủng hộ và đồng hành của quý khách trong những sản phẩm tiếp theo. Xin chân thành cảm ơn!");
                        System.out.println();
                        do {
                            System.out.println(ColorManager.TRANGSUA+"Vui lòng để lại đánh giá về chương trình."+ColorManager.RESET);
                            System.out.println();
                            System.out.println("\t"+ColorManager.GREEN_BACKGROUND+"1.Đánh giá"+ColorManager.RESET+"\t\t\t"+ColorManager.RED_BACKGROUND+"2.Bỏ qua"+ColorManager.RESET);
                            System.out.println();
                            System.out.print(ColorManager.TRANGSUA+" ➣ Chọn :\t"+ColorManager.RESET);
                            int choiceDanhGia = Integer.parseInt(scanner.nextLine());
                            System.out.println();
                            switch (choiceDanhGia){
                                case 1:
                                    bangDanhGia();
                                    System.out.println(ColorManager.DONHAT+"Đã thoát chuong trình."+ColorManager.RESET);
                                    System.exit(0);
                                    break;
                                case 2:
                                    System.out.println(ColorManager.DONHAT+"Đã thoát chuong trình."+ColorManager.RESET);
                                    System.exit(0);
                                    break;
                                default:
                                    System.out.println(ColorManager.RED+ "Vui lòng chọn 1 và 2. Xin cảm ơn!"+ColorManager.RESET);
                            }
                        }while (true);
                    default:
                        System.out.println(ColorManager.RED+"Vui lòng chọn chức năng từ 1 đến 3."+ColorManager.RESET);
                }
            } catch (NumberFormatException ex1){
                System.out.println(ColorManager.RED+"Lỗi " +ex1.getMessage() + "❗️ Vui lòng nhập lại."+ColorManager.RESET);
            } catch (Exception exception){
                System.out.println(ColorManager.RED+"Xảy ra lỗi " + exception.getMessage() + "❗️ Vui lòng liên hệ tới hệ thống."+ColorManager.RESET);
            }
        } while (true);
    }
    public static void bangDanhGia(){
        boolean check = true;
        do {
            System.out.println(" ✧✧✧✧✧✧✧✧✧✧ "+ColorManager.YELLOW_BOLD+"BẢNG ĐÁNH GIÁ"+ColorManager.RESET+" ✧✧✧✧✧✧✧✧✧✧");
            System.out.println(" ✧\t\t\t1. "+ColorManager.VANGDAM+"⭐︎\t\t\t\t  "+ColorManager.RESET+" ✧");
            System.out.println(" ✧\t\t\t2. "+ColorManager.VANGDAM+"⭐︎ ⭐︎\t\t\t\t  "+ColorManager.RESET+" ✧");
            System.out.println(" ✧\t\t\t3. "+ColorManager.VANGDAM+"⭐︎ ⭐︎ ⭐︎\t\t\t  "+ColorManager.RESET+" ✧");
            System.out.println(" ✧\t\t\t4. "+ColorManager.VANGDAM+"⭐︎ ⭐︎ ⭐︎ ⭐︎\t\t\t  "+ColorManager.RESET+" ✧");
            System.out.println(" ✧\t\t\t5. "+ColorManager.VANGDAM+"⭐︎ ⭐︎ ⭐︎ ⭐︎ ⭐︎\t\t  "+ColorManager.RESET+" ✧");
            System.out.println(" ✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧");
            System.out.print(ColorManager.TRANGSUA+"\t➣ Chọn đánh giá :\t"+ColorManager.RESET);
            int choiceStar = Integer.parseInt(scanner.nextLine());
            System.out.println();
            switch (choiceStar){
                case 1:
                    System.out.println(ColorManager.YELLOW+"Cảm ơn về sự đánh giá của quý khách. Rất mong nhận được sự tin yêu và ủng hộ");
                    System.out.println("của quý khách hàng cho những trải nghiệm tiếp theo. Xin chân thành cảm ơn!");
                    System.out.println();
                    check = false;
                    break;
                case 2:
                    System.out.println(ColorManager.YELLOW+"Cảm ơn về sự đánh giá của quý khách. Rất mong nhận được sự tin yêu và ủng hộ");
                    System.out.println("của quý khách hàng cho những trải nghiệm tiếp theo. Xin chân thành cảm ơn! ");
                    System.out.println();
                    check = false;
                    break;
                case 3:
                    System.out.println(ColorManager.YELLOW+"Cảm ơn về sự đánh giá của quý khách. Rất mong nhận được sự tin yêu và ủng hộ");
                    System.out.println("của quý khách hàng cho những trải nghiệm tiếp theo. Xin chân thành cảm ơn!  ");
                    System.out.println();
                    check = false;
                    break;
                case 4:
                    System.out.println(ColorManager.YELLOW+"Cảm ơn về sự đánh giá của quý khách. Rất mong nhận được sự tin yêu và ủng hộ");
                    System.out.println("của quý khách hàng cho những trải nghiệm tiếp theo. Xin chân thành cảm ơn!   ");
                    System.out.println();
                    check = false;
                    break;
                case 5:
                    System.out.println(ColorManager.YELLOW+"Cảm ơn về sự đánh giá của quý khách. Rất mong nhận được sự tin yêu và ủng hộ");
                    System.out.println("của quý khách hàng cho những trải nghiệm tiếp theo. Xin chân thành cảm ơn!    ");
                    System.out.println();
                    check = false;
                    break;
                default:
                    System.out.println(ColorManager.RED + "Vui lòng chọn từ 1 đến 5. Xin cảm ơn!"+ColorManager.RESET);
            }
        }while (check);
    }


}
