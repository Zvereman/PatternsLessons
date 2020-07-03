import java.util.*;

public class ObjectPoolLesson {
    public static void main(String[] args) {
        ObjectPool objectPool = new ObjectPool();
        PooledObject pooledObject = objectPool.getPooledObject();
        objectPool.releasePooledObject(pooledObject);
    }
}

class PooledObject {}

class ObjectPool {
    List<PooledObject> free = new LinkedList<>();
    List<PooledObject> used = new LinkedList<>();

    PooledObject getPooledObject() {
        if(free.isEmpty()) {
            PooledObject pooledObject = new PooledObject();
            free.add(pooledObject);
            return pooledObject;
        } else {
            PooledObject pooledObject = free.get(0);
            used.add(pooledObject);
            free.remove(pooledObject);
            return pooledObject;
        }
    }

    void releasePooledObject(PooledObject pooledObject) {
        used.remove(pooledObject);
        free.add(pooledObject);
    }
}