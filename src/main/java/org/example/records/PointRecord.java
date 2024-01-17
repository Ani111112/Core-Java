package org.example.records;


public record PointRecord(int x, int y) {
    public int getNewOffSet(int ofSet) {
        int newx = x + ofSet;
        int newy = y + ofSet;
        return newx + newy;
    }
}
