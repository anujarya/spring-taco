package sia.tacocloud.data;

import sia.tacocloud.models.Taco;

public interface TacoRepository {
    Taco save(Taco design);
}