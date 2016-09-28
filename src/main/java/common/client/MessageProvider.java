package common.client;

/**
 *
 */
@FunctionalInterface
public interface MessageProvider<T> {
    T get();
}
