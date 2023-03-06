public class Leaf extends Base{
    public Leaf(String name, String type, String project, Base parent) {
        super(name, type, project, parent);
    }

    @Override
    public String getProjectName() {
        return getParent().getProject()+"\n"+getName();
    }

    @Override
    public int getSuperviseCount() {
        return 0;
    }

    @Override
    public String getList(int spaceCount) {
        String temp = "";

        for(int i=0; i<spaceCount; i++) {
            temp += " ";
        }

        return temp+">> "+getName()+"\n";
    }

    @Override
    public int getChildCount() {
        return 0;
    }
}
