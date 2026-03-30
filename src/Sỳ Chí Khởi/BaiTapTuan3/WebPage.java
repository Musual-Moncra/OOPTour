package baitaptuan3;

class Font {
    private int fontSize;
    private String fontName;

    //constructor
    public Font() {
    }

    public Font(int fontSize, String fontName) {
        this.fontSize = fontSize;
        this.fontName = fontName;
    }
    
    //getter&setter
    public int getFontSize() {
        return fontSize;
    }
    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }
    public String getFontName() {
        return fontName;
    }
    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    
    public void output() {
        System.out.printf("Font Name: %s | Font Size: %d\n", fontName, fontSize);
    }
}

public class WebPage {
    private String title;
    private String language;
    private Font fontWebPage;

    public WebPage(String title, String language, Font fontWebPage) {
        this.title = title;
        this.language = language;
        this.fontWebPage = fontWebPage;
    }

    public void output() {
        System.out.println("--- THONG TIN TRANG WEB ---");
        System.out.println("Tieu de: " + title);
        System.out.println("Ngon ngu: " + language);
        System.out.println("Font su dung: " + fontWebPage.getFontName());
        System.out.println("Kich thuoc Font: " + fontWebPage.getFontSize());
    }

    public static void main(String[] args) {
        Font fontWebPage = new Font(16, "Calibri");
        WebPage web1 = new WebPage("Tu hoc tieng Nhat cho BrSE", "Japanese", fontWebPage);

        web1.output();
        
        System.out.println("\n--- SAU KHI DOI FONT ---");
        fontWebPage.setFontName("Times New Roman");
        fontWebPage.setFontSize(18);
        
        web1.output();
    }
}