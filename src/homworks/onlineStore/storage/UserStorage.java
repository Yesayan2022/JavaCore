package homworks.onlineStore.storage;

import homworks.onlineStore.model.User;

public class UserStorage {

    private User[] users = new User[10];
    private int size;

    public void add(User user) {
        if (users.length == size) {
            extend();
        }
        users[size++] = user;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(users[i]);
        }
    }

    private void extend() {
        User[] tmp = new User[users.length + 10];
        System.arraycopy(users, 0, tmp, 0, users.length);
        users = tmp;

    }
}
