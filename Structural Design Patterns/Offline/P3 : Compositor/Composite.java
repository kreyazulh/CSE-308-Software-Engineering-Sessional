import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Composite extends Base{

    private List<Base> childList;
    public Composite(String name, String type, String project, Base parent) {
        super(name, type, project, parent);
        childList = new ArrayList<>();
    }

    @Override
    public String getProjectName() {
            return getProject();
    }

    @Override
    public int getSuperviseCount() {
        Iterator iterator = childList.iterator();
        int componentCount = 0;

        while(iterator.hasNext()) {
            Base targetEntity = (Base) iterator.next();

            if(targetEntity.getType().equalsIgnoreCase("developer")) {
                componentCount++;
            } else {
                componentCount += targetEntity.getSuperviseCount();
            }
        }

        return componentCount;
    }

    @Override
    public String getList(int spaceCount) {
        Iterator iterator = childList.iterator();
        String temp = "";

        for(int i=0; i<spaceCount; i++) {
            temp += " ";
        }

        temp += "--"+getName()+"\n";

        while(iterator.hasNext()) {
            Base targetEntity = (Base) iterator.next();

            temp += targetEntity.getList(spaceCount+2);
        }

        return temp;
    }
    @Override
    public void addEntity(Base targetEntity) {
        childList.add(targetEntity);
        return ;
    }
    @Override
    public void removeEntity(Base targetEntity) {
        childList.remove(targetEntity);
        return ;
    }

    @Override
    public Base getChild(int index) {
        return childList.get(index);
    }

    @Override
    public int getChildCount() {
        return childList.size();
    }
}
