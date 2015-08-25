package br.com.canajo.enums;

/**
 * Enum que representa as categorias possíveis para inscrição.
 * 
 * @author Gilberto Lupatini
 */
public enum Categoria {
    
    SUB20 {
	@Override public int getIdadeMaxima() {
	    return 20;
	}

	@Override public int getIdadeMinima() {
	    return 17;
	}
    },

    SUB17 {
	@Override public int getIdadeMaxima() {
	    return 17;
	}

	@Override public int getIdadeMinima() {
	    return 15;
	}
    },

    SUB15 {
	@Override public int getIdadeMaxima() {
	    return 15;
	}

	@Override public int getIdadeMinima() {
	    return 12;
	}
    },
    
    SUB12{
	@Override public int getIdadeMaxima() {
	    return 12;
	}

	@Override public int getIdadeMinima() {
	    return 12;
	}
    },

    PROFISSIONAL{
	@Override public int getIdadeMaxima() {
	    return 50;
	}

	@Override public int getIdadeMinima() {
	    return 12;
	}
    };
    
    abstract public int getIdadeMaxima();

    abstract public int getIdadeMinima();
}
