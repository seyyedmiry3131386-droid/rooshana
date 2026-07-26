package ir.mservices.market.common.search;

import defpackage.js3;
import defpackage.r50;
import ir.mservices.market.common.data.DynamicButtonDto;

/* JADX INFO: loaded from: classes3.dex */
public interface SearchAction extends r50 {

    public static final class OpenSearchBoxAction implements SearchAction {
        private final boolean searchBoxOpen;

        public OpenSearchBoxAction(boolean z) {
            this.searchBoxOpen = z;
        }

        public final boolean getSearchBoxOpen() {
            return this.searchBoxOpen;
        }
    }

    public static final class SetFirstListShow implements SearchAction {
        private final Boolean firstListShow;

        public SetFirstListShow(Boolean bool) {
            this.firstListShow = bool;
        }

        public final Boolean getFirstListShow() {
            return this.firstListShow;
        }
    }

    public static final class ShowDynamicButtonAction implements SearchAction {
        private final DynamicButtonDto dynamicButtonDto;

        public ShowDynamicButtonAction(DynamicButtonDto dynamicButtonDto) {
            js3.p(dynamicButtonDto, "dynamicButtonDto");
            this.dynamicButtonDto = dynamicButtonDto;
        }

        public final DynamicButtonDto getDynamicButtonDto() {
            return this.dynamicButtonDto;
        }
    }

    public static final class UpdateSearchStateAction implements SearchAction {
        private final SearchState state;

        public UpdateSearchStateAction(SearchState searchState) {
            js3.p(searchState, "state");
            this.state = searchState;
        }

        public final SearchState getState() {
            return this.state;
        }
    }
}
