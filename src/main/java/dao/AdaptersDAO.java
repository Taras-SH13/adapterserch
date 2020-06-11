package dao;

import domain.model.Adapters;

public interface AdaptersDAO {
    void addAdapters(Adapters adapter);

    void deleteAdapters(Adapters adapter);

    void updateAdapters(Adapters adapter);

    Adapters getAdapters(String adapterName);

}
