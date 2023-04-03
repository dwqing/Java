package minproject;

import java.util.List;

public class Friends_Lab {

    private List<Friend_> friend_list;

    public Friends_Lab() {

        for (int i = 0;i < 10;i++){
            Friend_ friend_ = new Friend_();
            friend_.setName("NO."+i);
            friend_list.add(friend_);
        }
    }
}
