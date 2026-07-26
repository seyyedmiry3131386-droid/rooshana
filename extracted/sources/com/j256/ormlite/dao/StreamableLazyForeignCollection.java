package com.j256.ormlite.dao;

import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.misc.IOUtils;
import j$.lang.Iterable$CC;
import j$.util.Collection;
import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.stream.Stream;
import j$.util.stream.StreamSupport;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* JADX INFO: loaded from: classes3.dex */
public class StreamableLazyForeignCollection<T, ID> extends LazyForeignCollection<T, ID> implements Collection {
    private static final long serialVersionUID = 1288122099601287859L;

    public StreamableLazyForeignCollection(Dao<T, ID> dao, Object obj, Object obj2, FieldType fieldType, String str, boolean z) {
        super(dao, obj, obj2, fieldType, str, z);
    }

    @Override // java.lang.Iterable, j$.util.Collection
    public /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return Stream.Wrapper.convert(parallelStream());
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ boolean removeIf(Predicate predicate) {
        return Collection.CC.$default$removeIf(this, predicate);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    @Override // java.util.Collection
    public /* synthetic */ java.util.stream.Stream stream() {
        return Stream.Wrapper.convert(stream());
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ j$.util.stream.Stream parallelStream() {
        return Collection.CC.$default$parallelStream(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public j$.util.stream.Stream<T> stream() {
        final CloseableIterator<T> closeableIterator = closeableIterator();
        try {
            return StreamSupport.stream(Spliterators.spliteratorUnknownSize(closeableIterator, 0), false).onClose(new Runnable() { // from class: com.j256.ormlite.dao.StreamableLazyForeignCollection.1
                @Override // java.lang.Runnable
                public void run() {
                    IOUtils.closeQuietly(closeableIterator);
                }
            });
        } catch (Error | RuntimeException e) {
            closeableIterator.closeQuietly();
            throw e;
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection
    public CloseableSpliterator<T> spliterator() {
        CloseableIterator<T> closeableIterator = closeableIterator();
        try {
            return new CloseableSpliteratorImpl(closeableIterator);
        } catch (Error | RuntimeException e) {
            closeableIterator.closeQuietly();
            throw e;
        }
    }
}
