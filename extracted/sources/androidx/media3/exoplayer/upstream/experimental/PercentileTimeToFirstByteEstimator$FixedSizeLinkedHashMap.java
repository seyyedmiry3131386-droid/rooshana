package androidx.media3.exoplayer.upstream.experimental;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class PercentileTimeToFirstByteEstimator$FixedSizeLinkedHashMap<K, V> extends LinkedHashMap<K, V> {
    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        return size() > 0;
    }
}
