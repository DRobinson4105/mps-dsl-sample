package NewLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import java.util.List;
import java.util.Iterator;
import jetbrains.mps.internal.collections.runtime.ListSequence;

public class Map {
  private java.util.Map<Object, Object> map = MapSequence.fromMap(new HashMap<Object, Object>());

  public Map(List<Object> keys, List<Object> values) {
    {
      Iterator<Object> key_it = ListSequence.fromList(keys).iterator();
      Iterator<Object> value_it = ListSequence.fromList(values).iterator();
      Object key_var;
      Object value_var;
      while (key_it.hasNext() && value_it.hasNext()) {
        key_var = key_it.next();
        value_var = value_it.next();
        MapSequence.fromMap(map).put(key_var, value_var);
      }
    }
  }

  public void setValue(Object key, Object value) {
    MapSequence.fromMap(map).put(key, value);
  }

  public Object getValue(Object key) {
    return MapSequence.fromMap(map).get(key);
  }

  @Override
  public String toString() {
    return map + "";
  }
}