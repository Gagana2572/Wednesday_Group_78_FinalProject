/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Request;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author likhithng
 */
public class ModifyItemsRequestDirectory {
    private List<ModifyItemsRequest> modifyItemsRequestList;

    public ModifyItemsRequestDirectory() {
        modifyItemsRequestList = new ArrayList<ModifyItemsRequest>();
    }

    public List<ModifyItemsRequest> getModifyItmesRequestList() {
        return modifyItemsRequestList;
    }

    public void setModifyItemsRequestList(List<ModifyItemsRequest> modifyMenuRequestList) {
        this.modifyItemsRequestList = modifyMenuRequestList;
    }
    
    public ModifyItemsRequest createModifyItemsRequest(Item item){
        ModifyItemsRequest modifyItemsRequest = new ModifyItemsRequest(item);
        modifyItemsRequestList.add(modifyItemsRequest);
        return modifyItemsRequest;
    }
}
