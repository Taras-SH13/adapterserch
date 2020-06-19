package dao;

        import domain.model.Adapters;

        import java.util.HashSet;
        import java.util.Set;

public class AdapterInMemDao implements AdaptersDAO {

    private static Set<Adapters> adapterList19v_3_42a_65w_55x25mm = new HashSet();
    private static Set<Adapters> adapterList19v_4_74a_90w_55x25mm = new HashSet();



    @Override
    public void addAdapters1(Adapters adapter, HashSet list) {
        list.add(adapter);
    }

    @Override
    public void deleteAdapters(Adapters adapter) {

    }

    @Override
    public void updateAdapters(Adapters adapter) {

    }

    @Override
    public Adapters getAdapters(String adapterName) {
        return null;
    }
}
