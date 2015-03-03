package soot.toolkits.graph;

import soot.Body;

/**
 *
 * @author Timothy
 * @param <N>
 */
public interface DirectedBodyGraph<N> extends DirectedGraph<N>{
    
    /**
     * @return the {@link Body} from which this graph was built
     */
    public Body getBody();
}
