package me_sad.coursework3_1.Service;

import me_sad.coursework3_1.Model.Sock;
import me_sad.coursework3_1.Model.SockStore;

public interface SockService {
    void addSock(SockStore sockStore);

    void putSock(SockStore sockStore);

    int getQuantity(Sock sock);

    int getSock(String color, int size, int cottonPartMin, int cottonPartMax);
}
