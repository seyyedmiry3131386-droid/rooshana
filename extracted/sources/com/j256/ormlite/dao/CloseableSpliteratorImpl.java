package com.j256.ormlite.dao;

import android.content.ContentProviderClient;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import com.j256.ormlite.misc.IOUtils;
import defpackage.d1;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Comparator;
import java.util.concurrent.ExecutorService;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes3.dex */
public class CloseableSpliteratorImpl<T> implements CloseableSpliterator<T> {
    private final Spliterator<T> delegate;
    private final CloseableIterator<? extends T> iterator;

    public CloseableSpliteratorImpl(CloseableIterator<? extends T> closeableIterator) {
        this.delegate = Spliterators.spliteratorUnknownSize(closeableIterator, 0);
        this.iterator = closeableIterator;
    }

    @Override // j$.util.Spliterator
    public int characteristics() {
        return this.delegate.characteristics();
    }

    @Override // java.lang.AutoCloseable
    public void close() throws Exception {
        CloseableIterator<? extends T> closeableIterator = this.iterator;
        if (closeableIterator instanceof AutoCloseable) {
            closeableIterator.close();
            return;
        }
        if (closeableIterator instanceof ExecutorService) {
            d1.m((ExecutorService) closeableIterator);
            return;
        }
        if (closeableIterator instanceof TypedArray) {
            ((TypedArray) closeableIterator).recycle();
            return;
        }
        if (closeableIterator instanceof MediaMetadataRetriever) {
            ((MediaMetadataRetriever) closeableIterator).release();
            return;
        }
        if (closeableIterator instanceof MediaDrm) {
            ((MediaDrm) closeableIterator).release();
        } else if (closeableIterator instanceof DrmManagerClient) {
            ((DrmManagerClient) closeableIterator).release();
        } else {
            if (!(closeableIterator instanceof ContentProviderClient)) {
                throw new IllegalArgumentException();
            }
            ((ContentProviderClient) closeableIterator).release();
        }
    }

    @Override // com.j256.ormlite.dao.CloseableSpliterator
    public void closeQuietly() {
        IOUtils.closeQuietly(this);
    }

    @Override // j$.util.Spliterator
    public long estimateSize() {
        return this.delegate.estimateSize();
    }

    @Override // j$.util.Spliterator
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        Spliterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // j$.util.Spliterator
    public /* synthetic */ Comparator getComparator() {
        return Spliterator.CC.$default$getComparator(this);
    }

    @Override // j$.util.Spliterator
    public /* synthetic */ long getExactSizeIfKnown() {
        return Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    @Override // j$.util.Spliterator
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    @Override // j$.util.Spliterator
    public boolean tryAdvance(Consumer<? super T> consumer) {
        return this.delegate.tryAdvance(consumer);
    }

    @Override // j$.util.Spliterator
    public Spliterator<T> trySplit() {
        return this.delegate.trySplit();
    }
}
