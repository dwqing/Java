package minproject;

import java.util.ArrayList;
import java.util.List;

public class Main {




    public static void main(String[] args) {
        List<Friend_> friend_list = new ArrayList<>();
        List<Friend_> newFriend_list = new ArrayList<>();
        for (int i = 0;i < 12;i++){
            Friend_ friend_ = new Friend_();
            friend_.setName("NO."+i);
            friend_list.add(friend_);
        }
        for (int i=0;i<friend_list.size();i++){
            if (friend_list.get(i).getName().contains("1")){
                newFriend_list.add(friend_list.get(i));
            }
        }
        for (int i=0;i<friend_list.size();i++){
            System.out.println(friend_list.get(i).getName());
        }
        for (int i=0;i<newFriend_list.size();i++){
            System.out.println(newFriend_list.get(i).getName());
        }


    }
}
