
import java.util.ArrayList;
import java.util.List;

public class SubChapter{

    private String subChapterName;
    private List<Paragraph> paragraphList = new ArrayList<Paragraph>();
    private List<Image> imageList = new ArrayList<Image>();
    private List<Table> tableList = new ArrayList<Table>();

    public SubChapter(String subChapterName){
        this.subChapterName = subChapterName;
    }

    public void createNewParagraph(String paragraphName){
        Paragraph lastParagraph = new Paragraph(paragraphName);
        this.paragraphList.add(lastParagraph);
    }

    public void createNewImage(String imageName){
        Image lastImage = new Image(imageName);
        this.imageList.add(lastImage);
    }

    public void createNewTable(String tableName){
        Table lastTable = new Table(tableName);
        this.tableList.add(lastTable);
    }

    public String getSubchaptersubChapterName(){
        return this.subChapterName;
    }

    public void print(){
        System.out.println("Subchapter: " + this.subChapterName);
        for (Paragraph paragraph: this.paragraphList)
            System.out.println("Paragraph: " + paragraph.getParagraphName());
        for (Image image: this.imageList)
            System.out.println("Image with name:" + image.getImageName());
        for (Table table: this.tableList)
            System.out.println("Table with name: " + table.getTableName());
    }
    
}