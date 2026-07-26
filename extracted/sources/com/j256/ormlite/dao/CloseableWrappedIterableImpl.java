package com.j256.ormlite.dao;

import android.content.ContentProviderClient;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import com.j256.ormlite.misc.IOUtils;
import defpackage.d1;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public class CloseableWrappedIterableImpl<T> implements CloseableWrappedIterable<T> {
    private final CloseableIterable<T> iterable;
    private CloseableIterator<T> iterator;

    public CloseableWrappedIterableImpl(CloseableIterable<T> closeableIterable) {
        this.iterable = closeableIterable;
    }

    @Override // com.j256.ormlite.dao.CloseableWrappedIterable, java.lang.AutoCloseable
    public void close() throws Exception {
        CloseableIterator<T> closeableIterator = this.iterator;
        if (closeableIterator != null) {
            if (closeableIterator instanceof AutoCloseable) {
                closeableIterator.close();
            } else if (closeableIterator instanceof ExecutorService) {
                d1.m((ExecutorService) closeableIterator);
            } else if (closeableIterator instanceof TypedArray) {
                ((TypedArray) closeableIterator).recycle();
            } else if (closeableIterator instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) closeableIterator).release();
            } else if (closeableIterator instanceof MediaDrm) {
                ((MediaDrm) closeableIterator).release();
            } else if (closeableIterator instanceof DrmManagerClient) {
                ((DrmManagerClient) closeableIterator).release();
            } else {
                if (!(closeableIterator instanceof ContentProviderClient)) {
                    throw new IllegalArgumentException();
                }
                ((ContentProviderClient) closeableIterator).release();
            }
            this.iterator = null;
        }
    }

    @Override // com.j256.ormlite.dao.CloseableIterable
    public CloseableIterator<T> closeableIterator() {
        IOUtils.closeQuietly(this);
        CloseableIterator<T> closeableIterator = this.iterable.closeableIterator();
        this.iterator = closeableIterator;
        return closeableIterator;
    }

    @Override // java.lang.Iterable
    public CloseableIterator<T> iterator() {
        return closeableIterator();
    }
}
