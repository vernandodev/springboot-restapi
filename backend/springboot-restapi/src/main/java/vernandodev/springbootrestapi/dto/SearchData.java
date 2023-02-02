package vernandodev.springbootrestapi.dto;

public class SearchData {
    private String searchKey;
    private String otherSearchkey;

    public String getOtherSearchkey() {
        return otherSearchkey;
    }

    public void setOtherSearchkey(String otherSearchkey) {
        this.otherSearchkey = otherSearchkey;
    }

    public String getSearchKey() {
        return searchKey;
    }

    public void setSearchKey(String searchKey) {
        this.searchKey = searchKey;
    }
}
