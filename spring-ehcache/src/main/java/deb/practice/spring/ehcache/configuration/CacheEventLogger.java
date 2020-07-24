package deb.practice.spring.ehcache.configuration;

import org.ehcache.event.CacheEvent;
import org.ehcache.event.CacheEventListener;
import org.springframework.stereotype.Component;

/**
 * Created by Deb
 * Date : 22/07/2020.
 */
@Component
public class CacheEventLogger implements CacheEventListener<Object, Object> {

    // ...

    @Override
    public void onEvent(CacheEvent<? extends Object, ? extends Object> cacheEvent) {
        System.out.println(String.format("Cache message with %s %s %s",
                cacheEvent.getKey(), cacheEvent.getOldValue(), cacheEvent.getNewValue()));
    }
}
