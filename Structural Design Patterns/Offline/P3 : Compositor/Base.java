public abstract class Base {

    private String name;
    private String type;
    private String project;
    private Base parent;

    public Base(String name, String type, String project, Base parent) {
        this.name = name;
        this.type = type;
        this.project = project;
        this.parent = parent;
    }

    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
    public String getProject() {
        return project;
    }
    public Base getParent() {
        return parent;
    }
    public abstract String getProjectName();
    public abstract int getSuperviseCount();
    public abstract String getList(int spaceCount);

    public String getDetails() {
        return "Name: "+name+"\n"+"Role: "+type+"\n"+"Project: "+getProject()+"\n"+"Supervisee Count: "+getSuperviseCount()+"\n";
    }
    public void addEntity(Base targetEntity) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    public void removeEntity(Base targetEntity) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }
    public Base getChild(int index) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }
    /* additional */
    public abstract int getChildCount();

}
