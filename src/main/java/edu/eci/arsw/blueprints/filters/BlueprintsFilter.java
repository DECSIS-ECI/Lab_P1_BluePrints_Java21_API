package edu.eci.arsw.blueprints.filters;

import edu.eci.arsw.blueprints.model.Blueprint;

public interface BlueprintsFilter {
    Blueprint apply(Blueprint bp);
}
