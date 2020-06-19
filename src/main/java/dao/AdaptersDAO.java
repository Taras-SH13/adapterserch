package dao;

import domain.model.Adapters;

import java.util.HashSet;

public interface AdaptersDAO {
    void addAdapters1(Adapters adapter,HashSet list);

    void deleteAdapters(Adapters adapter);

    void updateAdapters(Adapters adapter);

    Adapters getAdapters(String adapterName);

}
