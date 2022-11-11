import java.util.ArrayList;
import java.util.List;

public class Chapter {

    private String chapterName;
    private List<SubChapter> subChapters = new ArrayList<SubChapter>();

    public Chapter(String chapterName){
        this.chapterName = chapterName;
    }

    public int createSubChapter(String chapterNameSubchapter){
        SubChapter lastSubchapter = new SubChapter(chapterNameSubchapter);
        this.subChapters.add(lastSubchapter);
        return this.subChapters.indexOf(lastSubchapter);
    }

    public SubChapter getSubChapter(int indexSubchapter){
        return this.subChapters.get(indexSubchapter);
    }

    public String getchapterName(){
        return this.chapterName;
    }
}
