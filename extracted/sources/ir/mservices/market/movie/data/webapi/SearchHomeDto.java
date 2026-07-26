package ir.mservices.market.movie.data.webapi;

import defpackage.vo7;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class SearchHomeDto implements Serializable {

    @vo7("elements")
    private final List<SearchHomeItemDto> items;

    public SearchHomeDto(List<SearchHomeItemDto> list) {
        this.items = list;
    }

    public final List<SearchHomeItemDto> getItems() {
        return this.items;
    }
}
