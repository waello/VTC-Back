package com.navettevatry.rem4u.common.utils.response.body;



import com.navettevatry.rem4u.common.utils.response.GenericResponseBody;
import org.springframework.hateoas.PagedModel;

import java.util.List;

/**
 * this class is used to render a list of objects response with pagination
 *
 * @author Chakib Daii
 */
public class PaginatedListResponse<T extends Object> extends GenericResponseBody {

    private long size; // Total of elements
    private long count; // Total of pages
    private long page;
    private List<T> list;
    private PagedModel pagedResource;

    public PaginatedListResponse() {
        super();
    }

    /**
     * @param size
     * @param count
     * @param page
     * @param list
     */
    public PaginatedListResponse(long size, long count, long page, List<T> list) {
        this.size = size;
        this.count = count;
        this.page = page;
        this.list = list;
    }

    public PaginatedListResponse(PagedModel pagedResource, List<T> data) {
        this.pagedResource = pagedResource;
        this.size = pagedResource.getMetadata().getTotalElements();
        this.count = pagedResource.getMetadata().getTotalPages();
        this.page = pagedResource.getMetadata().getNumber();
        this.list = data;
    }

    /**
     * @return the count
     */
    public long getCount() {
        return count;
    }

    /**
     * @return the page
     */
    public long getPage() {
        return page;
    }

    /**
     * @return the size
     */
    public long getSize() {
        return size;
    }

    /**
     * @return the list
     */
    public List<T> getList() {
        return list;
    }


    public String getNext() {
        return pagedResource.getLink("next") != null ? pagedResource.getLink("next").toString() : null;
    }

    public String getPrevious() {
        return pagedResource.getLink("prev") != null ? pagedResource.getLink("prev").toString() : null;
    }

    public String getFirst() {
        return pagedResource.getLink("first") != null ? pagedResource.getLink("first").toString() : null;
    }

    public String getLast() {
        return pagedResource.getLink("last") != null ? pagedResource.getLink("last").toString() : null;
    }

}
